using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _Nh12
{
    class QLSV
    {
        private static QLSV _Instance;
        private SV[] _li;
        public int Length { get; set; }
        public static QLSV Instance
        {
            get
            {
                if (_Instance == null)
                    _Instance = new QLSV();
                return _Instance;
            }
            private set { }
        }
        private QLSV()
        {
            _li = null;
            Length = 0;
        }
        public void Add(SV s)
        {
            if (_li == null)
            {
                _li = new SV[1];
            }
            else if (Length >= _li.Length)
            {
                // Tăng kích thước lên một phần tử
                Array.Resize(ref _li, _li.Length + 1);
            }
            _li[Length] = s;
            Length++;
        }
        public void Insert(SV s, int index)
        {
            if (index < 0 || index > Length)
            {
                return;
            }
            Array.Resize(ref _li, _li.Length + 1);
            Length++;
            for (int i = Length - 1; i > index; i--)
            {
                _li[i] = _li[i - 1];
            }
            _li[index] = s;
        }
        public void AddRange(SV[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Add(arr[i]);
            }
        }
        public int IndexOf(SV s)
        {
            // tìm kiếm phần tử s
            for (int i = 0; i < Length; i++)
            {
                if (_li[i].Equals(s))
                {
                    return i;
                }
            }
            return -1;
        }

        public void RemoveAt(int index)
        {
            if (index < 0 || index > Length)
            {
                return;
            }

            for (int i = index; i < Length - 1; i++)
            {
                _li[i] = _li[i + 1];
            }
            Length--;
            Array.Resize(ref _li, _li.Length - 1);
        }

        public void Remove(SV s)
        {
            int index = IndexOf(s);
            if (index != -1)
            {
                RemoveAt(index);
            }
        }
        public void Update(SV s)
        {
            int index = -1;
            // Tìm kiếm theo mssv
            for (int i = 0; i < Length; i++)
            {
                if (_li[i].MSSV.Equals(s.MSSV))
                {
                    index = i;
                    break;
                }
            }
            // Cập nhật thông tin
            if (index == -1)
            {
                Add(s);
                return;
            }
            // Gán giá trị mới
            _li[index] = s;

        }
        public override string ToString()
        {
            if (_li == null || Length == 0)
                return "Danh sách sinh viên trống.";
            string s = "";
            foreach (SV i in _li)
            {
                s += i.ToString();
            }
            return s;
        }

        public SV[] Search(string name)
        {
            SV[] data = new SV[Length];
            int count = 0;
            for (int i = 0; i < Length; i++)
            {
                // Kiểm tra giá trị name có xuất hiện trong _li[i].Name không
                if (_li[i].Name.Contains(name))
                {
                    data[count++] = _li[i];
                }
            }
            Array.Resize(ref data, count);
            return data;
        }

        public SV[] Sort()
        {
            SV[] data = new SV[Length];
            Array.Copy(_li, data, Length);
            Array.Sort(data, (a, b) => a.Age.CompareTo(b.Age));
            return data;
        }
    }
}
