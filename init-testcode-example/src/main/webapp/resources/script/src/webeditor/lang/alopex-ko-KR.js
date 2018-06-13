(function ($) {
  $.extend($.webeditor.lang, {
    'ko-KR': {
      font: {
        bold: '굵게',
        italic: '기울임꼴',
        underline: '밑줄',
        clear: '글자 효과 없애기',
        height: '줄간격',
        name: '글꼴',
        superscript: '위 첨자',
        subscript: '아래 첨자',
        strikethrough: '취소선',
        size: '글자 크기'
      },
      image: {
        image: '사진',
        insert: '사진 추가',
        resizeFull: '100% 크기로 변경',
        resizeHalf: '50% 크기로 변경',
        resizeQuarter: '25% 크기로 변경',
        floatLeft: '왼쪽 정렬',
        floatRight: '오른쪽 정렬',
        floatNone: '정렬하지 않음',
        shapeRounded: '스타일: 둥근 모서리',
        shapeCircle: '스타일: 원형',
        shapeThumbnail: '스타일: 액자',
        shapeNone: '스타일: 없음',
        dragImageHere: '텍스트 혹은 사진을 이곳으로 끌어오세요',
        dropImage: '텍스트 혹은 사진을 내려놓으세요',
        selectFromFiles: '파일 선택',
        url: '사진 URL',
        remove: '사진 삭제'
      },
      video: {
        video: '동영상',
        videoLink: '동영상 링크',
        insert: '동영상 추가',
        url: '동영상 URL',
        providers: '(YouTube, Vimeo, Vine, Instagram, DailyMotion, Youku 사용 가능)'
      },
      link: {
        link: '링크',
        insert: '링크 추가',
        unlink: '링크 삭제',
        edit: '수정',
        textToDisplay: '링크에 표시할 내용',
        url: '이동할 URL',
        openInNewWindow: '새창으로 열기'
      },
      table : {
        table : '테이블',
        cell : '셀',
        width : '너비',
        height : '높이',
        tableStyle : '테이블 스타일',
        cellStyle : '셀 스타일',
        text : '텍스트',
	    align : '정렬',
	    border : '테두리',
	    target : '대상',
	    style : '스타일',
	    thickness : '두께',
	    color : '색',
	    apply : '적용',
	    confirm : '확인',
	    close : '닫기' 
      },
      hr: {
        insert: '구분선 추가'
      },
      style: {
        style: '스타일',
        normal: '본문',
        blockquote: '인용구',
        pre: '코드',
        h1: '제목 1',
        h2: '제목 2',
        h3: '제목 3',
        h4: '제목 4',
        h5: '제목 5',
        h6: '제목 6'
      },
      lists: {
        unordered: '글머리 기호',
        ordered: '번호 매기기'
      },
      options: {
        help: '도움말',
        fullscreen: '전체 화면',
        codeview: '코드 보기'
      },
      paragraph: {
        paragraph: '문단 정렬',
        outdent: '내어쓰기',
        indent: '들여쓰기',
        left: '왼쪽 정렬',
        center: '가운데 정렬',
        right: '오른쪽 정렬',
        justify: '양쪽 정렬'
      },
      color: {
        recent: '마지막으로 사용한 색',
        more: '다른 색 선택',
        background: '배경색',
        foreground: '글자색',
        transparent: '투명',
        setTransparent: '투명',
        reset: '취소',
        resetToDefault: '기본 값으로 변경'
      },
      shortcut: {
        shortcuts: '키보드 단축키',
        close: '닫기',
        textFormatting: '글자 스타일 적용',
        action: '기능',
        paragraphFormatting: '문단 스타일 적용',
        documentStyle: '문서 스타일 적용'
      },
      help: {
          'insertParagraph': '줄바꿈',
          'undo': '실행 취소',
          'redo': '다시 실행',
          'tab': '탭',
          'untab': '탭 취소',
          'bold': '굵게',
          'italic': '기울임꼴',
          'underline': '밑줄',
          'removeFormat': '폰트 스타일 취소',
          'strikethrough': '취소선',
          'justifyLeft': '왼쪽 정렬',
          'justifyCenter': '중앙 절렬',
          'justifyRight': '오른쪽 정렬',
          'justifyFull': '양쪽 정렬',
          'insertUnorderedList': '글머리 기호',
          'insertOrderedList': '번호 매기기',
          'outdent': '내어쓰기',
          'indent': '들여쓰기',
          'formatPara': 'P tag',
          'formatH1': '제목 1',
          'formatH2': '제목 2',
          'formatH3': '제목 3',
          'formatH4': '제목 4',
          'formatH5': '제목 5',
          'formatH6': '제목 6',
          'insertHorizontalRule': '가로줄',
          'linkDialog.show': '다이얼로그 '
        },
      history: {
        undo: '실행 취소',
        redo: '다시 실행'
      },
      specialChar: {
        specialChar: '특수문자',
        select: '특수문자를 선택하세요'
      }
    }
  });
})(jQuery);
